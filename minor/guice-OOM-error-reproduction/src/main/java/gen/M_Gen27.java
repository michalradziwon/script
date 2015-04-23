
  package gen;
  public class M_Gen27 {
  		@com.google.inject.Inject
  		public M_Gen27(M_Gen28 m_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  