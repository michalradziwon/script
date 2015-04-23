
  package gen;
  public class M_Gen140 {
  		@com.google.inject.Inject
  		public M_Gen140(M_Gen141 m_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  