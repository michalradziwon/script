
  package gen;
  public class Q_Gen23 {
  		@com.google.inject.Inject
  		public Q_Gen23(Q_Gen24 q_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  