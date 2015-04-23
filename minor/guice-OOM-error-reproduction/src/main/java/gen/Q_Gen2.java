
  package gen;
  public class Q_Gen2 {
  		@com.google.inject.Inject
  		public Q_Gen2(Q_Gen3 q_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  