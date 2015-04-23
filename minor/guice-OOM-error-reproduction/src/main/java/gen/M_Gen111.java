
  package gen;
  public class M_Gen111 {
  		@com.google.inject.Inject
  		public M_Gen111(M_Gen112 m_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  