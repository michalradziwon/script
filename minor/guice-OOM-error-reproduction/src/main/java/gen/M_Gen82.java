
  package gen;
  public class M_Gen82 {
  		@com.google.inject.Inject
  		public M_Gen82(M_Gen83 m_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  