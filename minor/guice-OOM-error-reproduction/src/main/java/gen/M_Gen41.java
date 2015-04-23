
  package gen;
  public class M_Gen41 {
  		@com.google.inject.Inject
  		public M_Gen41(M_Gen42 m_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  