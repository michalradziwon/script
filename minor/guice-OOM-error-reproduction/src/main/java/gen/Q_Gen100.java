
  package gen;
  public class Q_Gen100 {
  		@com.google.inject.Inject
  		public Q_Gen100(Q_Gen101 q_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  