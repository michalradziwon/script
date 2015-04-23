
  package gen;
  public class M_Gen199 {
  		@com.google.inject.Inject
  		public M_Gen199(M_Gen200 m_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  