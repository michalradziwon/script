
  package gen;
  public class Q_Gen58 {
  		@com.google.inject.Inject
  		public Q_Gen58(Q_Gen59 q_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  