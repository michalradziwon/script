
  package gen;
  public class M_Gen145 {
  		@com.google.inject.Inject
  		public M_Gen145(M_Gen146 m_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  