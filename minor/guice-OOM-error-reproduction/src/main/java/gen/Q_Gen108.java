
  package gen;
  public class Q_Gen108 {
  		@com.google.inject.Inject
  		public Q_Gen108(Q_Gen109 q_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  