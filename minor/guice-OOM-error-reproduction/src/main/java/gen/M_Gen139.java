
  package gen;
  public class M_Gen139 {
  		@com.google.inject.Inject
  		public M_Gen139(M_Gen140 m_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  