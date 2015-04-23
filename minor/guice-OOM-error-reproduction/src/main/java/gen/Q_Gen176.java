
  package gen;
  public class Q_Gen176 {
  		@com.google.inject.Inject
  		public Q_Gen176(Q_Gen177 q_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  