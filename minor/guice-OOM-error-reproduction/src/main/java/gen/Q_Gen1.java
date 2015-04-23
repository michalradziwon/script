
  package gen;
  public class Q_Gen1 {
  		@com.google.inject.Inject
  		public Q_Gen1(Q_Gen2 q_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  