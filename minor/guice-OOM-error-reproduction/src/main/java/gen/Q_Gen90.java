
  package gen;
  public class Q_Gen90 {
  		@com.google.inject.Inject
  		public Q_Gen90(Q_Gen91 q_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  