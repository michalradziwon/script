
  package gen;
  public class M_Gen59 {
  		@com.google.inject.Inject
  		public M_Gen59(M_Gen60 m_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  