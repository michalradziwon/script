
  package gen;
  public class M_Gen23 {
  		@com.google.inject.Inject
  		public M_Gen23(M_Gen24 m_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  