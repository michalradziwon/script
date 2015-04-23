
  package gen;
  public class M_Gen39 {
  		@com.google.inject.Inject
  		public M_Gen39(M_Gen40 m_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  