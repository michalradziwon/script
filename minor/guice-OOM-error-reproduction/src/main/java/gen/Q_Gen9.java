
  package gen;
  public class Q_Gen9 {
  		@com.google.inject.Inject
  		public Q_Gen9(Q_Gen10 q_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  