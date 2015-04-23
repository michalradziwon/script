
  package gen;
  public class M_Gen2 {
  		@com.google.inject.Inject
  		public M_Gen2(M_Gen3 m_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  