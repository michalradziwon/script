
  package gen;
  public class Q_Gen57 {
  		@com.google.inject.Inject
  		public Q_Gen57(Q_Gen58 q_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  