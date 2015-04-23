
  package gen;
  public class Q_Gen99 {
  		@com.google.inject.Inject
  		public Q_Gen99(Q_Gen100 q_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  