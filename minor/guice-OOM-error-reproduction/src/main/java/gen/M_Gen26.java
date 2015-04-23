
  package gen;
  public class M_Gen26 {
  		@com.google.inject.Inject
  		public M_Gen26(M_Gen27 m_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  