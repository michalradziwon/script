
  package gen;
  public class M_Gen112 {
  		@com.google.inject.Inject
  		public M_Gen112(M_Gen113 m_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  