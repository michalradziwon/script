
  package gen;
  public class M_Gen80 {
  		@com.google.inject.Inject
  		public M_Gen80(M_Gen81 m_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  