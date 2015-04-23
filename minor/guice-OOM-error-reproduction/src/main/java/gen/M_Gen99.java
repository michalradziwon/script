
  package gen;
  public class M_Gen99 {
  		@com.google.inject.Inject
  		public M_Gen99(M_Gen100 m_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  