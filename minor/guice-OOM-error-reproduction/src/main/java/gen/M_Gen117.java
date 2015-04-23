
  package gen;
  public class M_Gen117 {
  		@com.google.inject.Inject
  		public M_Gen117(M_Gen118 m_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  