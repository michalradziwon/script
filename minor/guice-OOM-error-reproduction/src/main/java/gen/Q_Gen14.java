
  package gen;
  public class Q_Gen14 {
  		@com.google.inject.Inject
  		public Q_Gen14(Q_Gen15 q_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  