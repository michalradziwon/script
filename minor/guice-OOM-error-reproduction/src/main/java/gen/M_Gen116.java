
  package gen;
  public class M_Gen116 {
  		@com.google.inject.Inject
  		public M_Gen116(M_Gen117 m_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  