
  package gen;
  public class Q_Gen62 {
  		@com.google.inject.Inject
  		public Q_Gen62(Q_Gen63 q_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  