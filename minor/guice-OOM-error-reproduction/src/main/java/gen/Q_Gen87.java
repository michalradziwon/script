
  package gen;
  public class Q_Gen87 {
  		@com.google.inject.Inject
  		public Q_Gen87(Q_Gen88 q_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  