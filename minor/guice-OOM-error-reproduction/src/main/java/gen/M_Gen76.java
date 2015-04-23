
  package gen;
  public class M_Gen76 {
  		@com.google.inject.Inject
  		public M_Gen76(M_Gen77 m_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  