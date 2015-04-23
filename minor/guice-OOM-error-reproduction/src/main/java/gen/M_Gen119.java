
  package gen;
  public class M_Gen119 {
  		@com.google.inject.Inject
  		public M_Gen119(M_Gen120 m_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  