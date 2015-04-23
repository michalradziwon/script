
  package gen;
  public class M_Gen114 {
  		@com.google.inject.Inject
  		public M_Gen114(M_Gen115 m_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  