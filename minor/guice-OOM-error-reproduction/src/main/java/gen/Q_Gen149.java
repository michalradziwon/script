
  package gen;
  public class Q_Gen149 {
  		@com.google.inject.Inject
  		public Q_Gen149(Q_Gen150 q_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  