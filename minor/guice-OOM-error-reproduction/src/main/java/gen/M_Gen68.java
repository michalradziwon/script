
  package gen;
  public class M_Gen68 {
  		@com.google.inject.Inject
  		public M_Gen68(M_Gen69 m_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  