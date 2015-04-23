
  package gen;
  public class M_Gen64 {
  		@com.google.inject.Inject
  		public M_Gen64(M_Gen65 m_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  