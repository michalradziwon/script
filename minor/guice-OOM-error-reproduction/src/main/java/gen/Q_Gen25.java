
  package gen;
  public class Q_Gen25 {
  		@com.google.inject.Inject
  		public Q_Gen25(Q_Gen26 q_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  