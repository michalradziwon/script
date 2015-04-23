
  package gen;
  public class M_Gen125 {
  		@com.google.inject.Inject
  		public M_Gen125(M_Gen126 m_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  