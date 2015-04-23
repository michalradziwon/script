
  package gen;
  public class Q_Gen45 {
  		@com.google.inject.Inject
  		public Q_Gen45(Q_Gen46 q_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  