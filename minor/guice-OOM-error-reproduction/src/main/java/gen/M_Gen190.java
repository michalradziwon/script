
  package gen;
  public class M_Gen190 {
  		@com.google.inject.Inject
  		public M_Gen190(M_Gen191 m_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  