
  package gen;
  public class M_Gen92 {
  		@com.google.inject.Inject
  		public M_Gen92(M_Gen93 m_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  