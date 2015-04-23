
  package gen;
  public class M_Gen25 {
  		@com.google.inject.Inject
  		public M_Gen25(M_Gen26 m_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  