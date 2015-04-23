
  package gen;
  public class Q_Gen44 {
  		@com.google.inject.Inject
  		public Q_Gen44(Q_Gen45 q_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  