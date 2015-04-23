
  package gen;
  public class M_Gen24 {
  		@com.google.inject.Inject
  		public M_Gen24(M_Gen25 m_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  