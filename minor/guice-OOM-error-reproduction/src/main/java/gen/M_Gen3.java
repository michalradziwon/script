
  package gen;
  public class M_Gen3 {
  		@com.google.inject.Inject
  		public M_Gen3(M_Gen4 m_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  