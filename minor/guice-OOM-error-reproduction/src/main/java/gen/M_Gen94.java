
  package gen;
  public class M_Gen94 {
  		@com.google.inject.Inject
  		public M_Gen94(M_Gen95 m_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  