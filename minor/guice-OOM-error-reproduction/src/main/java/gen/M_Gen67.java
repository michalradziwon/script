
  package gen;
  public class M_Gen67 {
  		@com.google.inject.Inject
  		public M_Gen67(M_Gen68 m_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  