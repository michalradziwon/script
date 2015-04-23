
  package gen;
  public class M_Gen4 {
  		@com.google.inject.Inject
  		public M_Gen4(M_Gen5 m_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  