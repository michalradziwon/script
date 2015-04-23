
  package gen;
  public class M_Gen147 {
  		@com.google.inject.Inject
  		public M_Gen147(M_Gen148 m_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  