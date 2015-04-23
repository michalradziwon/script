
  package gen;
  public class Q_Gen116 {
  		@com.google.inject.Inject
  		public Q_Gen116(Q_Gen117 q_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  