
  package gen;
  public class M_Gen95 {
  		@com.google.inject.Inject
  		public M_Gen95(M_Gen96 m_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  