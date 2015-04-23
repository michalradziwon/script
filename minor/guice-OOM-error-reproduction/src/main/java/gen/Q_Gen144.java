
  package gen;
  public class Q_Gen144 {
  		@com.google.inject.Inject
  		public Q_Gen144(Q_Gen145 q_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  